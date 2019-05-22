package tech.acgn;

import tech.acgn.InterFaces.MyInterFace;

public class Main implements MyInterFace {

    public static void main(String[] args){
	// write your code here
        System.out.println("hello world");
    }

    @Override
    public void sayhello() {
        System.out.println("hello");
    }

    @Override
    public void saygoodbye() {
        System.out.println("good bye");
    }
}
