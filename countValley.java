public static int countingValleys(int steps, String path) {
    boolean isInValley=false;
    int valleyCount=0;
    int moveCount=0;
    for(int i=0;i<path.length();i++){
        if(path.charAt(i)=='D'){
            moveCount--;
            if(!isInValley&&moveCount<0){
                valleyCount++;
                isInValley=true;
            }
        }
        else{
            moveCount++;
            if(moveCount>=0){
                isInValley=false;
            }
        }
        
    }
    return valleyCount;

    }
