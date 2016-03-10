package slotmachine;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;
import java.util.Set;

import com.google.common.collect.Multiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multisets;

public class slotmetodo {

    static int paga(List<String> reels) {
        Multiset<String> reelcount = HashMultiset.create();
        reelcount.addAll(reels);

       // ImmutableMultiset<String> HighestCountFirst = Multisets.copyHighestCountFirst(reelcount);
        
    return 0;    
    }
}
