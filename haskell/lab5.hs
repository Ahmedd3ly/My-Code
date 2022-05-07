import Data.Maybe

-- 1. Simple Datatype

--i)

data Direction = North | East | West | South deriving Show

turnAround :: Direction -> Direction
turnAround North = South
turnAround South = North
turnAround West = East
turnAround East = West

--ii)

turnLeft :: Direction -> Direction
turnLeft North = West
turnLeft South = East
turnLeft West = South
turnLeft East = North


turnRight :: Direction -> Direction
turnRight North = East
turnRight South = West
turnRight West = North
turnRight East = South


-- 2. Using Maybe

--i)

safetailMaybe :: [a] -> Maybe [a]
safetailMaybe [] = Nothing
safetailMaybe (x : xs) = Just xs

--ii)

takeMaybe :: Int -> [a] -> Maybe [a]
takeMaybe n xs | n > length xs = Nothing
	       | otherwise = Just xs
	       
	       
--Tree Datatype

data Btree a = Leaf a | Unary (Btree a) a | Binary (Btree a) a (Btree a) deriving (Eq, Show)

--i)

depth :: Btree a -> Int
depth  (Leaf val1) = 0
depth (Unary val1 x) = 1 + (depth val1) 
depth (Binary val1 x val2) = 1 + (max (depth val1) ( depth val2))


--ii)

mapBtree :: (a -> b) -> Btree a -> Btree b
mapBtree f (Leaf t)  = Leaf (f t)
mapBtree f (Unary val1 t) = (mapBtree f (val1)
mapBtree f (Binary val1 t val2)  =  (mapBtree f val1)




btreeToList :: Btree a -> [a]
btreeToList (Leaf x)       = [x]
btreeToList (Unary l x)    = btreeToList l ++ [x] 
btreeToList (Binary l x r) = btreeToList l ++ x : btreeToList r




























