import System.Random
getRandomNumberfrom1to10000 :: IO Int
getRandomNumberfrom1to10000 = randomRIO (1,10000)


--Question 1 & 2

isLarge :: IO()
isLarge = do {
                    putStrLn ("Enter a large Number");
                    x <- getLine;
                    if (length x) > 4
                    then putStrLn ("Good, the number you entered is " ++ x)
                    else 
                    	 do {
                    	 putStrLn ("Sorry, The number you entered isn't large enough :( , try again.");
                    	 isLarge
                    	}
                   }
                   
--Question 3

isLargeRand:: IO()
isLargeRand = do {
                    putStrLn ("Enter a large Number");
                    x <- getLine;
                    y <- getRandomNumberfrom1to10000;
                    if (read x >= y)
                    then putStrLn ("Good, the number you entered is " ++ x ++ " and the random number is " ++ show (y))
                    else 
                    	 do {
                    	 putStrLn ("Sorry, The number you entered isn't large enough :( , try again." );
                    	 isLargeRand
                    	}
                   }
                   
--Question 4

printStars :: Int -> IO()
printStars n = putStr (n ^ "*")
