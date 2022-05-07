third :: [Int] -> Int
third xs = xs!!2

last2 :: [Int] -> Int
last2 xs = xs!! (length xs -1)

init2 :: [Int] -> [Int]
init2 xs = take 3 xs

last3 :: [Int] -> [Int]
last3 xs = take 1 (reverse xs)

init3 :: [Int] -> [Int]
init3 xs = reverse(drop 1 (reverse xs))
