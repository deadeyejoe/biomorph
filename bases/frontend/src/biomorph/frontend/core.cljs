(ns biomorph.frontend.core
  (:require [reagent.dom :as rd]
            [re-frame.core :as rf]))

(defn render []
  (rd/render ["HELLO"]
             (js/document.getElementById "app")))

(defn ^:dev/before-load stop [])

(defn ^:dev/after-load start []
  (rf/clear-subscription-cache!)
  (render))

(defn init []
  (render))
