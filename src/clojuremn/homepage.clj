(ns clojuremn.homepage
  (:use [hiccup.core :only [html h]]
        [hiccup.page-helpers :only [doctype include-css]]))

(defn index-body []
  (html
   (doctype :html5)
   [:head
    [:meta {:charset "utf-8"}]
    [:title "Clojure.mn - The Minnesota Clojure User Group"]
    (include-css "/stylesheets/base.css")]
   [:body
    [:div {:id "content"}
     [:h1 "Clo" [:span {:id "clojure-j"} "j"] "ure.mn"]
     [:p {:id "tagline"} "The Minnesota Clojure Users Group"]
     [:p {:class "announcement"}
      "Join our "
      [:a {:href "http://groups.google.com/group/clojuremn"} "mailing list"]
      "."
      ]
     [:p {:class "announcement"}
      "Follow us on "
      [:a {:href "http://twitter.com/clojuremn"} "Twitter"]
      "."
      ]
     [:img {:id "logo" :src "/images/lambda.png"}]
     [:h2 "Next Meeting"]
     [:p "Our next meeting will be on Wednesday, August 10th at 7pm at the "
      [:a {:href "http://freighthouse.dunnbros.com/"} "Freight House Dunn Bros"] "."]
     [:h2 "July 13, 2011"]
     [:p "We discussed "
      [:a {:href "http://clojure-conj.org"} "Clojure/conj 2011"]
      ", compared the JVM to the CLR, and surveyed the NoSQL landscape."]
     ]
    ]))
