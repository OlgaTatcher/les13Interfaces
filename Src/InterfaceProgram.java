public class InterfaceProgram {
    public static void main(String[] args) {
        Android model1=new Android("model1");
        Android model2=new Android("model2");
        IPhones model3=new IPhones("model3");
        IPhones model4=new IPhones("model4");

        model1.call();
        System.out.println();

        model2.sms();

        System.out.println();

        model3.internet();
        System.out.println();

        model1.OperatingSysLoading();
        model4.OperatingSysLoading();

    }
}
