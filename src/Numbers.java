abstract class Numbers {
    private String a;
    private String b;
    private String operand;

    Numbers(String[] listNumbers) {
        this.a = listNumbers[0];
        this.operand = listNumbers[1];
        this.b = listNumbers[2];
    }

    public String getB() {
        return b;
    }

    public String getA() {
        return a;
    }

    public String getOperand() {
        return operand;
    }

    public abstract String calc() throws Exception;
}
