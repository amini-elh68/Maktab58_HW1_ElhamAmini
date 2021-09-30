package Maktab58_HW1_ElhamAmini.eight;

public class Sequence {
    char[] value;

    public char[] getValue() {
        return value;
    }

    public void setValue(char[] value) {
        this.value = value;
    }

    public void concat(Sequence sequence) {
        char[] arrayOne = this.getValue();
        char[] arrayTwo = sequence.getValue();
        char[] result = new char[arrayOne.length + arrayTwo.length];
        int index = 0;
        for (char c : arrayOne) {
            result[index++] = c;
        }
        for (char c : arrayTwo) {
            result[index++] = c;
        }
        this.setValue(result);
    }

    public int indexOf(char character) {
        int index = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == character) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void replace(Sequence oldChars, Sequence newChars) {
        int oldLength = oldChars.value.length;
        int index = -1;
        boolean exists = false;
        for (int i = 0; i < value.length - oldLength; i++) {
            if (exists == true) {
                break;
            }
            for (int j = 0; j < oldLength; j++) {
                if (exists == true) {
                    break;
                }
                if (value[i + j] == oldChars.value[j]) {
                    exists = true;
                    if (index == -1) {
                        index = i;
                    }
                }
            }
        }
        if (exists == true) {
            char[] newArray = new char[value.length - oldChars.value.length + newChars.value.length];
            int valueIndex = 0;
            for (int i = 0; i < newArray.length; i++) {
                if (i == index) {
                    i += newChars.value.length - 1;
                    valueIndex += oldChars.value.length;
                    continue;
                }
                newArray[i] = value[valueIndex++];
            }
            for (int i = 0; i < newChars.value.length; i++) {
                newArray[index + i] = newChars.value[i];
            }
            this.setValue(newArray);
        }
    }

    public boolean equals(Sequence otherSeq) {
        boolean isEqual = false;
        if (value.length == otherSeq.value.length) {
            for (int i = 0; i < value.length; i++) {
                if (value[i] == otherSeq.value[i]) {
                    isEqual = true;
                }
            }
        }
        return isEqual;//main else
    }
}
