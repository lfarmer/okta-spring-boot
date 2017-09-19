package com.okta.spring.oauth.code.mvc;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("okta.web")
public class OktaWebProperties {

    private HeadProperties head = new HeadProperties();

    private String logo = "https://ok1static.oktacdn.com/assets/img/logos/okta-logo.png";

    public HeadProperties getHead() {
        return head;
    }

    public void setHead(HeadProperties head) {
        this.head = head;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public static class HeadProperties {

        private String cssUris = "/okta/okta.css";

        private String extraCssUris;

        private String view = "okta/head";

        private String fragmentSelector = "head";

        public String getCssUris() {
            return cssUris;
        }

        public void setCssUris(String cssUris) {
            this.cssUris = cssUris;
        }

        public String getExtraCssUris() {
            return extraCssUris;
        }

        public void setExtraCssUris(String extraCssUris) {
            this.extraCssUris = extraCssUris;
        }

        public String getView() {
            return view;
        }

        public void setView(String view) {
            this.view = view;
        }

        public String getFragmentSelector() {
            return fragmentSelector;
        }

        public void setFragmentSelector(String fragmentSelector) {
            this.fragmentSelector = fragmentSelector;
        }
    }

}
