(ns msolli.kondo-potemkin
  (:require [msolli.core :refer :all])
  (:gen-class))

(defn greet
  "Callable entry point to the application."
  [_]
  (prn (-> (ok)
           (content-type "foo/bar"))))
