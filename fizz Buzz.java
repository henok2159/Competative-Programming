
//fizz buzz

class Solution {
    public List<String> fizzBuzz(int n) {
        String [] solutionArray=new String[n];
        for(int i=1;i<=n;i++){

            if(i%15==0){
                solutionArray[i-1]="FizzBuzz";
            }else if(i%5==0){
        solutionArray[i-1]="Buzz";
            }
            else if( i%3==0){
                solutionArray[i-1]="Fizz";
            }
            else{
                solutionArray[i-1]=Integer.toString(i);
            }

        }
        return Arrays.asList(solutionArray);
        
    }
}
