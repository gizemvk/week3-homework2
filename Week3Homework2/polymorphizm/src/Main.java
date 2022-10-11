public class Main {
    public static void main(String[] args) {

//        BaseLogger[] loggers =new BaseLogger[] { new DataBaseLogger(),new ConsoleLogger(),new EmailLogger(),new FileLogger()};
//
//        for ( BaseLogger logger:loggers
//             ) {
//            logger.log(" log mesajı.");
//        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());

        customerManager.add();


    }
}