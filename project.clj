(defproject tadam "0.1.1"
  :description "First version"
  :url "https://github.com/tadam-framework/tadam"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 ;; Clojure
                 [org.clojure/clojure "1.10.0"]
                 ;; Managing environment settings
                 [environ "1.1.0"]
                 ;; Templates
                 [selmer "1.12.12"]
                 ;; JSON encoding
                 [cheshire "5.9.0"]
                 ;; Validations
                 [jkkramer/verily "0.6.0"]
                 ;; Migrations
                 [migratus "1.2.4"]
                 ]
  ;; ALIAS
  :aliases {
            "migrate"         ["run" "-m" "tadam.db/migrate"]
            "rollback"        ["run" "-m" "tadam.db/rollback"]
            "createsuperuser" ["run" "-m" "tadam.db/createsuperuser"]
            "listsuperusers"  ["run" "-m" "tadam.db/listsuperusers"]
            }
  :repl-options {:init-ns tadam.core})