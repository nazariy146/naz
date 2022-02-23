package tests.web.webCase;

import org.testng.annotations.Test;
import tests.web.webSteps.WebSteps;
import tests.web.webUtils.WebUtils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WebInterface {
    WebSteps webSteps = new WebSteps();
    WebUtils webUtils = new WebUtils();

    @Test
    public void webInterface() {
        webUtils.webOpen1C();                       //запуск 1с
        this.menuQuick();                   //меню Главное
        this.menuReceiving();               //меню Приход
        this.menuShipment();                //меню Отгрузка
        this.menuInventory();               //меню Запасы
        this.menuReports();                 //меню Отчеты
        this.menuBilling();                 //меню Биллинг
        this.menuCrossTransit();            //меню Кросс транзит
        this.menuTransportDelivery();       //меню Доставка
        this.menuDirectories();             //меню Справочники
        this.menuSettings();                //меню Администрирование
        this.menuExchange();                //меню Обмен УС
        this.menuDevelopment();             //меню Разработка
    }                   //старт проверки интерфейса

    public void menuQuick(){
        webSteps.clickMenu(0);
        webSteps.verifyEverythingData(0, "Монитор эффективности склада");
        webSteps.verifyEverythingData(1, "Управление складом");
    }                       //меню Главное

    public void menuReceiving () { //меню Приход
        webSteps.clickMenu(1);
        webSteps.verifyEverythingData(0, "Контроль поставки", "РМ Возврата товаров", "Учет дополнительных работ", "Прием товара", "Проблемная ситуация", "Рекламация", "Анализ загруженности склада", "Загруженность склада", "Изменения статусов номенклатуры", "К отбору", "Логирование изменения движений", "Назначенные ресурсы документам", "Резерв размещения");
        webSteps.verifyEverythingData(1, "Генератор временных контейнеров", "Контроль поставки", "Дополнительные обработки", "Дополнительные отчеты", "Поиск документов по контейнеру / грузоместу", "Учет дополнительных работ", "Распределение позиций между ресурсами");
    }

    public void menuShipment(){ //меню Отгрузка
        webSteps.clickMenu(2);
        webSteps.verifyEverythingData(0, "Контроль отгрузки", "Учет дополнительных работ", "Отгрузка товара", "Грузоместо", "Проблемная ситуация", "Рекламация", "Журнал отгрузок", "К отбору", "Контроль фактического выполнения распоряжений УС", "Остаток сравнение с потребностью отгрузки", "Отчет по документам отгрузки", "Отчет по нехватке товара", "Проблемные ситуации", "Резерв отбора");
        webSteps.verifyEverythingData(1, "Генератор временных контейнеров", "Корректировка серийных номеров", "Объединение контейнеров", "Печать этикеток грузомест", "Поиск документов по контейнеру / грузоместу", "Учет дополнительных работ", "Распределение позиций между ресурсами", "Контроль контейнеров");

    }                    //меню Отгрузка

    public void menuInventory(){//Запасы
        $("#themesCell_theme_3").click();
        $("#cmd_0_0_txt").shouldHave(text("Управление инвентаризацией"));
    //Документы
        $("#cmd_0_1_txt").shouldHave(text("Перемещение товара"));
        $("#cmd_0_2_txt").shouldHave(text("ABC-классификация товаров"));
        $("#cmd_0_3_txt").shouldHave(text("Движение по серийным номерам"));
        $("#cmd_0_4_txt").shouldHave(text("Движение по складу"));
        $("#cmd_0_5_txt").shouldHave(text("Движение тары"));
        $("#cmd_0_6_txt").shouldHave(text("Инвентаризация"));
        $("#cmd_0_7_txt").shouldHave(text("Инвентаризация тары"));
        $("#cmd_0_8_txt").shouldHave(text("Комплектация товаров"));
        $("#cmd_0_9_txt").shouldHave(text("Результат инвентаризации"));
    //Отчеты
        $("#cmd_0_10_txt").shouldHave(text("ABC Анализ"));
        $("#cmd_0_11_txt").shouldHave(text("Анализ загруженности склада"));
        $("#cmd_0_12_txt").shouldHave(text("Оборотка по номенклатуре"));
        $("#cmd_0_13_txt").shouldHave(text("Остатки с учетом резервов"));
        $("#cmd_0_14_txt").shouldHave(text("Остатки тары"));
        $("#cmd_0_15_txt").shouldHave(text("Остатки товаров"));
        $("#cmd_0_16_txt").shouldHave(text("Свободные ячейки"));
        $("#cmd_0_17_txt").shouldHave(text("Статистика по категории и зоне склада"));
    //Сервис
        $("#cmd_1_0_txt").shouldHave(text("Изменение статусов номенклатуры"));
        $("#cmd_1_1_txt").shouldHave(text("Корректировка серийных номеров"));
        $("#cmd_1_2_txt").shouldHave(text("Подбор номенклатуры"));
        $("#cmd_1_3_txt").shouldHave(text("Поиск товаров по серийному номеру"));
        $("#cmd_1_4_txt").shouldHave(text("Пополнение зоны отбора по нормам"));
        $("#cmd_1_5_txt").shouldHave(text("Пополнение зоны склада"));
        $("#cmd_1_6_txt").shouldHave(text("Уплотнение склада"));
        $("#cmd_1_7_txt").shouldHave(text("Дополнительные обработки"));
        $("#cmd_1_8_txt").shouldHave(text("Учет поклажедателя товара"));
    }

    public void menuReports(){ //меню Отчеты
        $("#themesCell_theme_4").click();
    //Остатки и обороты
        $("#cmd_0_0_txt").shouldHave(text("Движение по номенклатуре по документам"));
        $("#cmd_0_1_txt").shouldHave(text("Движение серийных номеров"));
        $("#cmd_0_2_txt").shouldHave(text("Движение товаров"));
        $("#cmd_0_3_txt").shouldHave(text("Изменения статусов номенклатуры"));
        $("#cmd_0_4_txt").shouldHave(text("Оборотка по номенклатуре"));
        $("#cmd_0_5_txt").shouldHave(text("Остатки и обороты по номенклатуре"));
        $("#cmd_0_6_txt").shouldHave(text("Остатки товаров"));
        $("#cmd_0_7_txt").shouldHave(text("Остатки с учетом резервов"));
        $("#cmd_0_8_txt").shouldHave(text("Остатки серийных номеров"));
        $("#cmd_0_9_txt").shouldHave(text("Остатки тары"));
        $("#cmd_0_10_txt").shouldHave(text("Остаток сравнение с потребностью отгрузки"));
        $("#cmd_0_11_txt").shouldHave(text("Резерв отбора"));
        $("#cmd_0_12_txt").shouldHave(text("Резерв размещения"));
        $("#cmd_0_13_txt").shouldHave(text("Движение товаров по складам УС"));
    //Аналитика
        $("#cmd_0_14_txt").shouldHave(text("ABC Анализ"));
        $("#cmd_0_15_txt").shouldHave(text("Анализ грузопотока и эффективности"));
        $("#cmd_0_16_txt").shouldHave(text("Анализ загруженности склада"));
        $("#cmd_0_17_txt").shouldHave(text("Анализ обслуживания категорий номенклатуры"));
        $("#cmd_0_18_txt").shouldHave(text("Загруженность склада"));
        $("#cmd_0_19_txt").shouldHave(text("Задолженность по таре"));
        $("#cmd_0_20_txt").shouldHave(text("Контроль фактического выполнения распоряжений УС"));
        $("#cmd_0_21_txt").shouldHave(text("Логирование изменения движений"));
        $("#cmd_0_22_txt").shouldHave(text("Монитор эффективности склада"));
        $("#cmd_0_23_txt").shouldHave(text("Нагрузка на склад по часам"));
        $("#cmd_0_24_txt").shouldHave(text("Несоответствие категорий товара ячеек"));
        $("#cmd_0_25_txt").shouldHave(text("Несоответствие размещения товаров по классам"));
        $("#cmd_0_26_txt").shouldHave(text("Номенклатура дней без движения"));
        $("#cmd_0_27_txt").shouldHave(text("Показатели склада для чат бота"));
        $("#cmd_0_28_txt").shouldHave(text("Свободные ячейки"));
    //Ресурсы
        $("#cmd_1_0_txt").shouldHave(text("Биллинг ресурсов ТСД"));
        $("#cmd_1_1_txt").shouldHave(text("Биллинг ресурсов ТСД (грязное время)"));
        $("#cmd_1_2_txt").shouldHave(text("Биллинг ресурсов ТСД по операциям"));
        $("#cmd_1_3_txt").shouldHave(text("Биллинг ресурсов по виду работы"));
        $("#cmd_1_4_txt").shouldHave(text("Назначенные ресурсы документам"));
        $("#cmd_1_5_txt").shouldHave(text("Ресурсы и роли"));
        $("#cmd_1_6_txt").shouldHave(text("Статистика по категории и зоне склада"));
    //Обработка документов
        $("#cmd_1_7_txt").shouldHave(text("Журнал отгрузок"));
        $("#cmd_1_8_txt").shouldHave(text("К отбору"));
        $("#cmd_1_9_txt").shouldHave(text("Контроль позиций на ТСД"));
        $("#cmd_1_10_txt").shouldHave(text("Незавершенные документы"));
        $("#cmd_1_11_txt").shouldHave(text("Обработанные позиции"));
        $("#cmd_1_12_txt").shouldHave(text("Общий по документам"));
        $("#cmd_1_13_txt").shouldHave(text("Отчет по документам отгрузки"));
        $("#cmd_1_14_txt").shouldHave(text("Отчет по маршрутам"));
        $("#cmd_1_15_txt").shouldHave(text("Отчет по маршрутным листам"));
        $("#cmd_1_16_txt").shouldHave(text("Отчет по нехватке товара"));
        $("#cmd_1_17_txt").shouldHave(text("Отчет по отгрузкам"));
        $("#cmd_1_18_txt").shouldHave(text("Отчет по этапам документов"));
        $("#cmd_1_19_txt").shouldHave(text("Проблемные ситуации"));
    //Инвентаризация
        $("#cmd_1_20_txt").shouldHave(text("Информация по инвентаризации"));
        $("#cmd_1_21_txt").shouldHave(text("Проведенная инвентаризация по ячейкам"));
        $("#cmd_1_22_txt").shouldHave(text("Результаты инвентаризации"));
    //Отчеты для сверки
        $("#cmd_1_23_txt").shouldHave(text("Сверка остатков по СН"));
        $("#cmd_1_24_txt").shouldHave(text("Сверка остатков с УС"));
        $("#cmd_1_25_txt").shouldHave(text("Сверка остатков с УС 3"));
    //Отчеты
        $("#cmd_2_0_txt").shouldHave(text("Задолженность по таре"));
    //Сервис
        $("#cmd_2_1_txt").shouldHave(text("Дополнительные отчеты"));
    }                     //меню Отчеты

    public void menuBilling(){ //меню Биллинг
        $("#themesCell_theme_5").click();
        $("#cmd_0_0_txt").shouldHave(text("Учет дополнительных работ"));
    //Биллинг по операциям
        $("#cmd_0_1_txt").shouldHave(text("Виды работ биллинг ресурсов"));
        $("#cmd_0_2_txt").shouldHave(text("Единица учета работ"));
        $("#cmd_0_3_txt").shouldHave(text("Регистрация выработки ресурсов"));
    //Отчеты
        $("#cmd_0_4_txt").shouldHave(text("Биллинг ресурсов по виду работы"));
        $("#cmd_0_5_txt").shouldHave(text("Биллинг ресурсов ТСД"));
        $("#cmd_0_6_txt").shouldHave(text("Биллинг ресурсов ТСД по операциям"));
        $("#cmd_0_7_txt").shouldHave(text("Ресурсы и роли"));
        $("#cmd_0_8_txt").shouldHave(text("Статистика по категории и зоне склада"));
    }

    public void menuCrossTransit(){ //меню Кросс транзит
        $("#themesCell_theme_6").click();
        $("#cmd_0_0_txt").shouldHave(text("Ожидаемые грузоместа кросс-транзит"));
        $("#cmd_0_1_txt").shouldHave(text("Грузо места кросс транзит"));
        $("#cmd_1_0_txt").shouldHave(text("Грузоместо"));
        $("#cmd_1_1_txt").shouldHave(text("Заявка кросс транзит"));
        $("#cmd_1_2_txt").shouldHave(text("ТСД: задание КроссТранзит"));
      }

    public void menuTransportDelivery(){ //меню Доставка
        $("#themesCell_theme_7").click();
        $("#cmd_0_0_txt").shouldHave(text("Управление маршрутными листами"));
        $("#cmd_0_1_txt").shouldHave(text("Консолидации / отправки"));
    //Документы
        $("#cmd_0_2_txt").shouldHave(text("Маршрутный лист"));
    //Справочники
        $("#cmd_0_3_txt").shouldHave(text("Адреса доставки"));
        $("#cmd_0_4_txt").shouldHave(text("Водители транспортных средств"));
        $("#cmd_0_5_txt").shouldHave(text("Маршруты"));
        $("#cmd_0_6_txt").shouldHave(text("Модели ТС"));
        $("#cmd_0_7_txt").shouldHave(text("Способы доставки"));
        $("#cmd_0_8_txt").shouldHave(text("Транспортные средства"));
    //Отчеты
        $("#cmd_1_0_txt").shouldHave(text("Отчет по маршрутам"));
        $("#cmd_1_1_txt").shouldHave(text("Отчет по маршрутным листам"));
    }

    public void menuDirectories(){ //меню Справочники
        $("#themesCell_theme_8").click();
    //Основные
        $("#cmd_0_0_txt").shouldHave(text("Контрагенты"));
        $("#cmd_0_1_txt").shouldHave(text("Номенклатура"));
        $("#cmd_0_2_txt").shouldHave(text("Номенклатура категории"));
        $("#cmd_0_3_txt").shouldHave(text("Организации"));
        $("#cmd_0_4_txt").shouldHave(text("Склады"));
        $("#cmd_0_5_txt").shouldHave(text("Склады учетной системы"));
        $("#cmd_0_6_txt").shouldHave(text("Тара"));
        $("#cmd_0_7_txt").shouldHave(text("Ячейки склада"));
    //Дополнительные
        $("#cmd_1_0_txt").shouldHave(text("Материалы упаковок"));
        $("#cmd_1_1_txt").shouldHave(text("Переносные контейнеры"));
        $("#cmd_1_2_txt").shouldHave(text("Серии номенклатуры"));
        $("#cmd_1_3_txt").shouldHave(text("Серийные номера"));
        $("#cmd_1_4_txt").shouldHave(text("Температурные режимы"));
        $("#cmd_1_5_txt").shouldHave(text("Упаковка номенклатуры"));
    //Персонал
        $("#cmd_1_6_txt").shouldHave(text("Пользователи"));
        $("#cmd_1_7_txt").shouldHave(text("Ресурсы"));
        $("#cmd_1_8_txt").shouldHave(text("Ресурсы роли"));
    //Сервис
        $("#cmd_2_0_txt").shouldHave(text("Настройка ролей ресурсов"));
        $("#cmd_2_1_txt").shouldHave(text("Пакетное создание локаций"));
        $("#cmd_2_2_txt").shouldHave(text("Поиск документов по контейнеру / грузоместу"));
        $("#cmd_2_3_txt").shouldHave(text("Редактирование параметров номенклатуры"));
        $("#cmd_2_4_txt").shouldHave(text("Склады пользователей"));
    }

    public void menuSettings(){ //меню Администрирование
        $("#themesCellfwrdNTPScroller").doubleClick();
        $("#themesCellfwrdNTPScroller").click();
        $("#themesCell_theme_9").click();
    //Персонал
        $("#cmd_0_0_txt").shouldHave(text("Склады пользователей"));
    //Настройки
        $("#cmd_0_1_txt").shouldHave(text("Виды движения по складам"));
        $("#cmd_0_2_txt").shouldHave(text("Движения между ячейками"));
        $("#cmd_0_3_txt").shouldHave(text("Значения свойств партии"));
        $("#cmd_0_4_txt").shouldHave(text("Настройки подбора категорий"));
        $("#cmd_0_5_txt").shouldHave(text("Настройки размещения"));
        $("#cmd_0_6_txt").shouldHave(text("Настройки создания грузомест"));
        $("#cmd_0_7_txt").shouldHave(text("Номенклатура пополнение по min / max"));
        $("#cmd_0_8_txt").shouldHave(text("Номенклатура ячеек"));
        $("#cmd_0_9_txt").shouldHave(text("Подключения к почтовому серверу"));
        $("#cmd_0_10_txt").shouldHave(text("Принтеры фоновой печати"));
        $("#cmd_0_11_txt").shouldHave(text("Свойства документов"));
        $("#cmd_0_12_txt").shouldHave(text("Свойства партии"));
        $("#cmd_0_13_txt").shouldHave(text("Свойства партии товаров"));
        $("#cmd_0_14_txt").shouldHave(text("Сопоставление категорий"));
        $("#cmd_0_15_txt").shouldHave(text("Фоновая печать"));
        $("#cmd_0_16_txt").shouldHave(text("Шаблоны реквизитов документа"));
        $("#cmd_0_17_txt").shouldHave(text("Шаблоны штриховых кодов"));
        $("#cmd_0_18_txt").shouldHave(text("Шаблоны этикеток"));
        $("#cmd_0_19_txt").shouldHave(text("Ячейки категории"));
    //Дополнительные отчеты и обработки
        $("#cmd_0_20_txt").shouldHave(text("Дополнительные обработки"));
        $("#cmd_0_21_txt").shouldHave(text("Дополнительные отчеты"));
        $("#cmd_0_22_txt").shouldHave(text("Дополнительные отчеты и обработки"));
        $("#cmd_0_23_txt").shouldHave(text("Назначение дополнительных обработок"));
    //Стратегии
        $("#cmd_0_24_txt").shouldHave(text("Стратегии складских операций"));
        $("#cmd_0_25_txt").shouldHave(text("Условия СКД"));
    //Логирование
        $("#cmd_1_0_txt").shouldHave(text("Логирование изменений"));
        $("#cmd_1_1_txt").shouldHave(text("Логирование изменения движений"));
        $("#cmd_1_2_txt").shouldHave(text("Логирование контроля отгрузки"));
    //Справочники
        $("#cmd_1_3_txt").shouldHave(text("Виды движения товаров УС"));
        $("#cmd_1_4_txt").shouldHave(text("Ключ аналитики планирования в работу"));
        $("#cmd_1_5_txt").shouldHave(text("Номенклатура статусы"));
        $("#cmd_1_6_txt").shouldHave(text("Причины проблемных ситуаций"));
    //Запуск документов
        $("#cmd_1_7_txt").shouldHave(text("Настройка запуска условия документов"));
        $("#cmd_1_8_txt").shouldHave(text("Настройки запуска документов"));
    //Лицензирование
        $("#cmd_1_9_txt").shouldHave(text("Договора лицензирования"));
        $("#cmd_1_10_txt").shouldHave(text("Лицензируемые устройства"));
    //Настройка документов
        $("#cmd_1_11_txt").shouldHave(text("Виды движения (настройки)"));
        $("#cmd_1_12_txt").shouldHave(text("Настройка этапов операций"));
        $("#cmd_1_13_txt").shouldHave(text("Настройки действий ПС"));
        $("#cmd_1_14_txt").shouldHave(text("Настройки операций"));
    //ТСД
        $("#cmd_1_15_txt").shouldHave(text("ТСД: задания"));
        $("#cmd_1_16_txt").shouldHave(text("ТСД: задания \"Проблемные ситуации\""));
        $("#cmd_1_17_txt").shouldHave(text("ТСД: исключительные ситуации"));
        $("#cmd_1_18_txt").shouldHave(text("ТСД: обновление"));
        $("#cmd_1_19_txt").shouldHave(text("ТСД: производительность"));
    //Сервис
        $("#cmd_2_0_txt").shouldHave(text("Активные пользователи"));
        $("#cmd_2_1_txt").shouldHave(text("Выбрать принтер"));
        $("#cmd_2_2_txt").shouldHave(text("Генерация и печать ШК"));
        $("#cmd_2_3_txt").shouldHave(text("Загрузка категорий"));
        $("#cmd_2_4_txt").shouldHave(text("Загрузка остатков по ячейкам"));
        $("#cmd_2_5_txt").shouldHave(text("Обработка очереди документов"));
        $("#cmd_2_6_txt").shouldHave(text("Печать документов с УС"));
        $("#cmd_2_7_txt").shouldHave(text("Удаление помеченных объектов"));
        $("#cmd_2_8_txt").shouldHave(text("Форма констант"));
    }

    public void menuExchange(){ //меню Обмен УС
        $("#themesCell_theme_10").click();
        $("#cmd_0_0_txt").shouldHave(text("Выгрузка документов УС"));
        $("#cmd_0_1_txt").shouldHave(text("Распределение pick by line"));
        $("#cmd_0_2_txt").shouldHave(text("Регистрация документов для обмена"));
        $("#cmd_1_0_txt").shouldHave(text("Сверка остатков с УС"));
        $("#cmd_1_1_txt").shouldHave(text("Сессии обмена сообщениями системы"));
    //Отчеты
        $("#cmd_2_0_txt").shouldHave(text("Сверка остатков с УС"));

    }                       //меню Обмен УС

    public void menuDevelopment(){  //меню Разработка
        $("#themesCell_theme_11").click();
        $("#cmd_0_0_txt").shouldHave(text("Консоль заданий"));
        $("#cmd_0_1_txt").shouldHave(text("Универсальные подбор и обработка объектов"));
        $("#cmd_0_2_txt").shouldHave(text("Регистрация изменений для обмена"));
        $("#cmd_0_3_txt").shouldHave(text("Настройка этапов операций"));
        $("#cmd_0_4_txt").shouldHave(text("Сессии обмена сообщениями системы"));
        $("#cmd_0_5_txt").shouldHave(text("Консоль запросов"));
        $("#cmd_0_6_txt").shouldHave(text("Логирование изменений"));
        $("#cmd_0_7_txt").shouldHave(text("Логирование изменения движений"));
        $("#cmd_0_8_txt").shouldHave(text("Назначение тары"));
        $("#cmd_0_9_txt").shouldHave(text("Очередь обработки этапов документов"));
    //Отчеты
        $("#cmd_1_0_txt").shouldHave(text("Логирование изменения движений"));
    //Сервис
        $("#cmd_2_0_txt").shouldHave(text("Консоль запросов 82"));
        $("#cmd_2_1_txt").shouldHave(text("Консоль запросов 83"));
        $("#cmd_2_2_txt").shouldHave(text("Печать документов с УС"));
        $("#cmd_2_3_txt").shouldHave(text("Редактирование параметров номенклатуры"));
        $("#cmd_2_4_txt").shouldHave(text("Ссылки по GUID"));
        $("#cmd_2_5_txt").shouldHave(text("Консоль заданий"));
        $("#cmd_2_6_txt").shouldHave(text("Версия"));
        $("#cmd_2_7_txt").shouldHave(text("Корректировка серийных номеров"));
        $("#cmd_2_8_txt").shouldHave(text("Поиск документов по контейнеру / грузоместу"));
        $("#cmd_2_9_txt").shouldHave(text("Поиск и замена дублирующихся элементов справочников"));
        $("#cmd_2_10_txt").shouldHave(text("Поиск товаров по серийному номеру"));
        $("#cmd_2_11_txt").shouldHave(text("ТСД"));
    }                    //меню Разработка

}
