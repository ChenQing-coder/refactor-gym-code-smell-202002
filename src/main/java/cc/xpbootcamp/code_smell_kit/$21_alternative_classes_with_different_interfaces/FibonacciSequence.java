package cc.xpbootcamp.code_smell_kit.$21_alternative_classes_with_different_interfaces;

public class FibonacciSequence {

    public long getValueAt(int position) {
        if (position == 1)
            return 1;
        if (position == 2)
            return 1;
        return getValueAt(position - 1) + getValueAt(position - 2);
    }

}
