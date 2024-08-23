import java.util.*;
import java.io.*;
class exception3{
public static void main(String[] arg){
try{
one();
}
catch(Exception e){
System.out.println("exception caught in main:"+e.getMessage());
}
}

static void one() throws Exception{
try {
two();
}
catch(Exception e){
System.out.println("exception caught in one:"+e.getMessage());
throw e;
}
}
static void two() throws Exception{
throw new Exception("Exception in two");
}
}

