class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }

}
class demo{
    public static void main(String[] args){
        try{
            vote(12);
        }
        catch(InvalidAgeException i){
            System.out.println(i);
        }

    }

    public static void vote(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}