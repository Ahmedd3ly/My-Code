cubeVol :: Int -> Int
cubeVol s = 6 * s^2

revStr :: [Char] -> [Char]
revStr [] = []
revStr [x] = [x]
revStr (x:xs) = revStr xs ++ [x]

countLarge :: [Int] -> Int
countLarge [] = 0
countLarge (x:xs) | x > 100    = 1 + countLarge xs
		  | otherwise  = countLarge xs

countLargeList :: [Int] -> Int
countLargeList [] = 0
countLargeList xs = length [x | x <- xs, x > 100]

countLargeHigh :: [Int] -> Int
countLargeHigh xs = length (filter (>100) xs)

charEq :: [Char] -> [Char] -> Bool
charEq xs ys = xs == ys

charEqIn :: [Char] -> [Char] -> Int ->  Bool
charEqIn xs ys n = if ( (xs !! n) == (ys !! n) )  
		    then True
		    else False
third :: (a,a,a) -> a   
third (x,y,z) = z
