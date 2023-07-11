public class IPhones extends AbstractName implements Smartphones, IOS {
    public IPhones(String name) {
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
        System.out.println(getName()+ " :Операційна система IOS");
    }
}
