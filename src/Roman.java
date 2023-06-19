import java.util.Map;

class Roman extends Numbers implements Lists {


    Roman(String[] listNumbers) {
        super(listNumbers);
    }

    private String createResult(int resultInt) {
        String result = "";
        String parseResultInt = String.valueOf(resultInt);
        if (parseResultInt.length() < 2) {
            result = mapRomanUnits.get(String.valueOf(parseResultInt.charAt(0)));
        } else if (parseResultInt.length() == 3) {
            result = "C";

        } else {
            if ((parseResultInt.charAt(1) == '0')) {
                result = mapRomanDozens.get(String.valueOf(parseResultInt.charAt(0)));
            } else {
                result = mapRomanDozens.get(String.valueOf(parseResultInt.charAt(0))) + mapRomanUnits.get(String.valueOf(parseResultInt.charAt(1)));
            }
        }

        return result;
    }

    @Override
    public String calc() throws Exception {
        int numberA = 0, numberB = 0;
        for (Map.Entry<String, String> set : mapRomanUnits.entrySet()) {
            if (getA().equals(set.getValue())) {
                numberA = Integer.parseInt(set.getKey());
            }
            if (getB().equals(set.getValue())) {
                numberB = Integer.parseInt(set.getKey());
            }
        }
        int resultInt;
        switch (getOperand()) {
            case "+":
                resultInt = numberA + numberB;
                return createResult(resultInt);
            case "-":
                resultInt = numberA - numberB;
                if (resultInt > 0) {
                    return createResult(resultInt);
                } else {
                    throw new Exception("Отрицательное или нуль");
                }
            case "/":
                resultInt = numberA / numberB;
                return createResult(resultInt);
            case "*":
                resultInt = numberA * numberB;
                return createResult(resultInt);
            default:
                throw new Exception("not operand");
        }
    }
}
