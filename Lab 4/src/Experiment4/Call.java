package Experiment4;

import java.util.Scanner;

abstract class Call {
    String type;
    float duration;

    float rate(){
        if (type.equals("urgent")) return 4.5f;
        else if (type.equals("lightning")) return 3.5f;
        return 2f;
    }
}

class Bill extends Call{
    float amount;
    void generate(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter call type (urgent/lightning/ordinary): ");
        this.type = input.next();
        System.out.print("Enter call duration: ");
        this.duration = input.nextFloat();
    }
    void calculate(){
        if (duration <= 1.5) this.amount = rate() * duration;
        else if(duration <= 3) this.amount = rate() * duration + 2f;
        else this.amount = rate() * duration + 4f;
    }
    void print(){
        System.out.println("Call Charges: " + amount);
    }
}





