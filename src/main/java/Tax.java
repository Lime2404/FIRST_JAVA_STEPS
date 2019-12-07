public class Tax {
    int numberOfDependents;
    double incomeGrowth;
    String state;

    public double calcTax() {  // если бы стоял void, то ничего бы не возвращалось
        //simple version
if (incomeGrowth <= 50000){
        return incomeGrowth*0.06;
    }
// Если колорадо то
    else if (state == "CO") {
        return incomeGrowth*0.1;
    }
    else
    return incomeGrowth*0.08;
    }

    public int countFamily() {
        if (numberOfDependents == 1) {
            return 1;
        } else if (numberOfDependents == 2) {
            return 2;
        } else return 3;
    }
}
