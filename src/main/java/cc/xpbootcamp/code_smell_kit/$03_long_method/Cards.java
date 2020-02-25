package cc.xpbootcamp.code_smell_kit.$03_long_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Cards {

    private List<Card> list = new ArrayList<Card>();

    //long method and include lots of things
    public Cards() {
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int i = 0; i < color.length; i++)
            for (int j = 0; j < number.length; j++) {
                list.add(new Card(color[i], number[j]));
            }
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getColor() + list.get(i).getNumber() + " ");
        }
        System.out.println(" ]");

    }
}