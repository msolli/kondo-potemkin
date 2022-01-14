(ns msolli.core
  (:require [potemkin]
            [ring.util.http-response]))

(potemkin/import-vars
  [ring.util.http-response ok content-type])