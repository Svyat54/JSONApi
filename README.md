# JSONApi - онлайн калькулятор систем счисления (перевод из 2 в 10, из 2 в 16, наоборот)
Необходимо реализовать web api по варианту. api должен реализовывать 3 метода:
</br>
/ping – пинг сервера
</br>
/status – статус сервера (сообщение о том, что сервер доступен и работает)
</br>
/solve – решение задачи по варианту
</br>
Обмен данными между клиентом и сервером должен осуществляться в формате JSON
Этапы выполнения работы.
1.	Создать Spring Web приложение, подключить Spring Web
2.	Разработать сообщения для API (классы либо рекорды)
3.	Разработать интерфейс и имплементацию класса (классов), ответственных за реализацию логики по варианту
4.	Реализовать контроллер, принимающий запросы и отправляющий ответы API
5.	Настроить DI для интерфейса (интерфейсов) логики через @Autowired и Java-конфигурации Bean (AppConfig)
6.	Протестировать API в Postman (дополнительно можно реализовать юнит-тестирование)
7.	Нарисовать диаграмму классов
