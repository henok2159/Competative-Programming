
//fizz buzz

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList <String> solutionList=new ArrayList();
        for(int i=1;i<=n;i++){

            if(i%15==0){
                solutionList.add("FizzBuzz");
            }else if(i%5==0){
        solutionList.add("Buzz");
            }
            else if( i%3==0){
             solutionList.add("Fizz");
            }
            else{
                solutionList.add(Integer.toString(i));
            }

        }
        return solutionList;
        
    }
}
