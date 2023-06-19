class Arabic extends Numbers {
    Arabic(String[] listNumbers) {
        super(listNumbers);
    }

    @Override
    public String calc() throws Exception {
        int x = Integer.parseInt(getA());
        int y = Integer.parseInt(getB());
        switch (getOperand()) {
            case "+":
                return String.valueOf(x+y);
            case "-":
                return String.valueOf(x - y);
            case "/":
                return String.valueOf(x / y);
            case "*":
                return String.valueOf(x * y);
            default:
                throw new Exception("not operand");
        }
    }
}
