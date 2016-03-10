package slotmachine;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;
import java.util.Set;



public class slotmetodo {

    static int paga(List<String> reels) {
        Multiset<String> reelcount = HashMultiset.create();
        reelcount.addall(reels);

        ImmutableMultiset<String> HighestCountFirst = Multisets.copyHighestCountFirst(reelcount);
    }
}
