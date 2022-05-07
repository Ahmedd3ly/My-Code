
import Data.Char

--q1)

funcTester :: (Int-> a) -> a
funcTester f   = f 10


funcString :: (Int-> a) -> a
funcString f = f 10


test123 :: Int -> Int
test123 x =  x *4

testBool :: Int -> Bool
testBool x = x > 100
			 
testBools :: Int -> Bool
testBools x  | x >= 100 = True
			 | otherwise = False

testChar :: Int -> [Char]
testChar x = show x


-- Q2)

extractDigits :: String -> String
extractDigits [] = []
extractDigits (x:xs) 
	| isDigit x = extractDigits xs
        | otherwise = (x : extractDigits xs)
        
-- Q3)

palindrome :: (Eq a) => [a] -> Bool
palindrome xs = (xs == reverse xs)


--a)

test0 :: [Integer]
test0 = [ x+3 | x <- [2,3,4,5,6] ]
 

test1 ::  [Bool]
test1 = [palindrome x | x <- ["madam", "adam", "otto", "elsa", "kajak", "tomas"] ]


test2 :: [[Char]]
test2 = [x | x <- ["madam", "adam", "otto", "elsa", "kajak", "tomas"] , palindrome x]

--b)

--Map (^2) (+3) [1..500]

--c)

--Map (length >2) testlist


-- Q4)

insertionSort :: Ord a => [a] -> [a]
insertionSort [] = []
insertionSort (x:xs) = insertElement x (insertionSort xs)



insertElement :: Ord a => a -> [a] -> [a]
insertElement x [] = [x]
insertElement x (y:ys) = if (x < y) 
			 then (x:y:ys)
			 else (y : insertElement x ys)



