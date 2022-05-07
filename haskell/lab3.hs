-- 1.Basic functions
palindrome ::[a] -> [a]
palindrome xs = reverse xs ++ xs

euclidian :: (Float,Float,Float) -> (Float,Float,Float) -> Float
euclidian (x1,x2,x3) (y1,y2,y3) = sqrt((y1 - x1)^2 + (y2 - x2)^2 + (y3 - x3)^2)

-- 2.safetail

safetail1 :: [a] -> [a]
safetail1 xs = if null xs 
	      then []
	      else tail xs
	      
	     
safetail2 :: [a] -> [a]
safetail2 xs | null xs = []
	     | otherwise = tail xs
	     
	     
safetail3 :: [a] -> [a]
safetail3 [] = []
safetail3 (x:xs) = xs
	     
	      
--3.List comprehension

--i) [ x^2 | x <- [1..500]]

-- ii) [ x | x <- [22..85], mod x 11 == 0]

-- iii)

appendToItself :: Int -> [Char]
appendToItself n = (show n) ++ reverse(show n)


--4.Perfects

factors:: Int -> [Int]
factors n = [x | x <- [1..n], mod n x == 0]

perfects:: Int -> [Int]
perfects n = [x | x <- [1..n], sum(factors x) -x  == x]
