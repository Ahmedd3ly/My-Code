import Data.Char
import Text.Read

--Input a Character and make it capital letter, then move to next line

getChar' :: IO ()
getChar' = do {
		x <- getChar;
		putChar (toUpper x);
		putChar '\n'	
	  }
	  
--Input a string and move to the next line

getLine' :: IO String
getLine' = do {
		x <- getChar;
		if x == '\n'
		then return ""
		else do {
		        xs <- getLine' ;
			return (x:xs) ;
			}
	      }
	      
--Get a String and move to the next line
	  
putStrLnS :: String -> IO()
putStrLnS xs = do {
		    putStr xs;
		    putChar '\n'
		  }
		  
--Input a string and find it's length

getLengthStr :: IO ()
getLengthStr = do {
			putStrLnS ("Can you input a string please?");
			x <- getLine;
			putStrLnS ("This string has length " ++ show (length x) ++ ".")
		  }
		  
		  
		  
		  
		  
		  
		  
readd:: IO()
readd = do {
	      putStr "what is 2 + 2 \n" ;
	      x <- getLine ;
	      if read x == 4
	      then putStr "You're right \n";
	      else putStr "Iam sorry \n"
	  }
	  
safeRead :: IO()
safeRead = do {
	        putStrLn "What is 2 + 2";
                x <- getLine;
                pursueWith (readMaybe x)
              }
            where pursueWith Nothing = putStrLn "enta katb eh ya3m enta... Katb eh"
         	  pursueWith (Just x) = if x == 4
           	                        then putStrLn "Gada3 wrby"
           	                        else putStrLn "tesda2 enk 3bet"
  

	






