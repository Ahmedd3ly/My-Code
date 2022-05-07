main :: IO ()
main = 
	do {

	x <- getLine;
	y <- getLine;
	z <- getLine;
	putStrLn ( y ++ ' ' : x);
	}

sumMultiplesOfFive :: [Int] -> Int
sumMultiplesOfFive (x:xs) = sum [x | x <- xs, x `mod` 5 == 0] 

sumMultiplesOfFive1 :: [Int] -> Int
sumMultiplesOfFive1 (x:xs) = sum (filter ( x `mod` 5 == 0) xs)

sumMultiplesOfFiveR :: [Int] -> Int
sumMultiplesOfFiveR [] = 0
sumMultiplesOfFiveR (x:xs) = if (x `mod` 5 == 0)
				then x + sumMultiplesOfFive xs
				else sumMultiplesOfFive xs
