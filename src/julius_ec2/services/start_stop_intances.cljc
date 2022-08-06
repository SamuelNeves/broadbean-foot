(ns julius-ec2.services.start-stop-intances)


(defn say-hello
  []
  #?(:bb  (str "Hello world. Babashka is a sweet friend of mine! Babashka version: " (System/getProperty "babashka.version"))
     :clj "Hello worl2d"))
