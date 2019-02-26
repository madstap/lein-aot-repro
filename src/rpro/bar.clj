(ns rpro.bar

  ;; I thought either of these would fix it,
  ;; but they seem to have no effect.
  (:require [rpro.foo])
  (:import (rpro foo))

  (:gen-class :name rpro.bar
              :methods [[getFoo [] rpro.foo]]))
