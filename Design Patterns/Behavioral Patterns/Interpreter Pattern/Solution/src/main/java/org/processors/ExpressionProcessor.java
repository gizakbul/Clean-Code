package org.processors;

import java.util.HashMap;
import java.util.Map;

public class ExpressionProcessor {
    public Map<Character, Integer> variables = new HashMap<>();

    public int calculate(String expression)
    {
        int result = 0;
        int current = 0;
        boolean hasNumber = false;
        boolean isNegative = false;

        for (int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch))
            {
                current = current * 10 + (ch - '0');
                hasNumber = true;
            }
            else if (Character.isLetter(ch))
            {
                if (hasNumber)
                {
                    result = applyOperation(result, current, isNegative);
                    current = 0;
                    hasNumber = false;
                }

                if (variables.containsKey(ch))
                {
                    current = variables.get(ch);
                }
                else
                {
                    return 0; // Değişken bulunamadıysa veya geçersizse 0 döndür
                }

                result = applyOperation(result, current, isNegative);
                current = 0;
                hasNumber = false;
            }
            else if (ch == '+' || ch == '-')
            {
                if (hasNumber)
                {
                    result = applyOperation(result, current, isNegative);
                    current = 0;
                    hasNumber = false;
                }

                isNegative = (ch == '-');
            }
            else
            {
                return 0; // Geçersiz karakter bulunursa 0 döndür
            }
        }

        if (hasNumber)
        {
            result = applyOperation(result, current, isNegative);
        }

        return result;
    }

    private int applyOperation(int result, int current, boolean isNegative)
    {
        return isNegative ? result - current : result + current;
    }
}
