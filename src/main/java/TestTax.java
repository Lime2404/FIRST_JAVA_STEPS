public class TestTax {
    public static void main(String[] args) {
        Tax tax = new Tax();
        Tax level = new Tax();
        tax.incomeGrowth = 50001;
        level.numberOfDependents = 1;  // десь надо задавать в качестве объекта тот, к которому это свойство применится.
        tax.state = "CO";
        int taxCode = level.countFamily();
        double S = tax.calcTax();
        System.out.println("С вас " + S);
// complicated
        switch (taxCode) {

            case 1:
                System.out.println("Trust");
                System.out.println("Since number of dependences = " + taxCode);
                break;
            case 2:
                System.out.println("Watch");
                System.out.println("Since number of dependences = " + taxCode);
            default:
                System.out.println("Refuse");
                System.out.println("Since number of dependences = " + taxCode);
        }
    }
}