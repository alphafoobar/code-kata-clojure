(ns kata02-binary-search.core-test
  (:require [clojure.test :refer :all]
            [kata02-binary-search.core :refer :all]))

(deftest incFunction
  (testing "inc 1 is 2"
    (is (= 2 (inc 1)))))

(deftest decFunction
  (testing "dec 2 is 1"
    (is (= 1 (dec 2)))))

(deftest arrayValueFunction
  (testing "A list is a function and calling it with an index provides the value"
    [(is (= 1 ([1, 3, 5] 0))),
     (is (= 3 ([1, 3, 5] 1))),
     (is (= 5 ([1, 3, 5] 2)))]
    ))

(deftest integerDivision
  (testing "1/2 is 0"
    [(is (= 0 (quot (+ 0 1) 2))),
     (is (= 1 (quot (+ 0 2) 2))),
     (is (= 1 (quot (+ 0 3) 2))),
     (is (= 2 (quot (+ 0 4) 2))),
     (is (= 2 (quot (+ 1 4) 2))),
     (is (= 3 (quot (+ 2 4) 2))),
     (is (= 3 (quot (+ 3 4) 2))),
     (is (= 4 (quot (+ 4 4) 2))),
     ]))

(deftest count-array-size
  (testing "Lists can be counted"
    [(is (= 0 (count []))),
     (is (= 1 (count [1]))),
     (is (= 2 (count [1, 3]))),
     (is (= 3 (count [1, 3, 5]))),
     (is (= 4 (count [1, 3, 5, 7])))]
    )
  )

(deftest empty-list-test
  (testing "If the list is empty then expect -1"
    (is (= nil (chop -1 [])))))

(deftest list-of-1-test
  (testing "Test binary search in a list of 1 items"
    [(is (= nil (chop -1 [1]))),
     (is (= 0 (chop 1 [1])))]
    )
  )

(deftest list-of-3-test-success
  (testing "Test binary search in a list of 3 items, that exist"
    [(is (= 0 (chop 1 [1, 3, 5]))),
     (is (= 1 (chop 3 [1, 3, 5]))),
     (is (= 2 (chop 5 [1, 3, 5])))]
    )
  )

(deftest list-of-3-test-failure
  (testing "Test binary search in a list of 3 items, that cannot be found"
    [(is (= nil (chop 0 [1, 3, 5]))),
     (is (= nil (chop 2 [1, 3, 5]))),
     (is (= nil (chop 4 [1, 3, 5]))),
     (is (= nil (chop 6 [1, 3, 5])))]
    )
  )

(deftest list-of-4-test-success
  (testing "Test binary search in a list of 4 items, elements that can be found"
    [(is (= 0 (chop 1 [1, 3, 5, 7]))),
     (is (= 1 (chop 3 [1, 3, 5, 7]))),
     (is (= 2 (chop 5 [1, 3, 5, 7]))),
     (is (= 3 (chop 7 [1, 3, 5, 7])))]
    )
  )

(deftest list-of-4-test-failure
  (testing "Test binary search in a list of 4 items, elements that do not exist"
    [(is (= nil (chop 0 [1, 3, 5, 7]))),
     (is (= nil (chop 2 [1, 3, 5, 7]))),
     (is (= nil (chop 4 [1, 3, 5, 7]))),
     (is (= nil (chop 6 [1, 3, 5, 7]))),
     (is (= nil (chop 8 [1, 3, 5, 7])))]
    )
  )
