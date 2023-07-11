public class Android extends AbstractName implements Smartphones,LinuxOS {

    public Android(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println(getName()+ " Здійснюю виклик");
    }

    @Override
    public void sms() {
        System.out.println(getName()+ " Відправляю СМС");
    }

    @Override
    public void internet() {
        System.out.println(getName()+ " Здійснюю підключення до Internet");
    }


    @Override
    public void OperatingSysLoading() {
        System.out.println(getName()+ " :Операційна система LinuxOS");
    }
}
