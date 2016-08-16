package com.ga.roosevelt.project_3.models.search_result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roosevelt on 8/15/16.
 */
public class SearchResult {

    @SerializedName("response")
    @Expose
    private Response response;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;

    /**
     *
     * @return
     * The response
     */
    public Response getResponse() {
        return response;
    }

    /**
     *
     * @param response
     * The response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     *
     * @param copyright
     * The copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }


    public class Byline {

        @SerializedName("person")
        @Expose
        private List<Person> person = new ArrayList<Person>();
        @SerializedName("original")
        @Expose
        private String original;

        /**
         *
         * @return
         * The person
         */
        public List<Person> getPerson() {
            return person;
        }

        /**
         *
         * @param person
         * The person
         */
        public void setPerson(List<Person> person) {
            this.person = person;
        }

        /**
         *
         * @return
         * The original
         */
        public String getOriginal() {
            return original;
        }

        /**
         *
         * @param original
         * The original
         */
        public void setOriginal(String original) {
            this.original = original;
        }

    }



    public class Doc {

        @SerializedName("web_url")
        @Expose
        private String webUrl;
        @SerializedName("snippet")
        @Expose
        private String snippet;
        @SerializedName("lead_paragraph")
        @Expose
        private String leadParagraph;
        @SerializedName("abstract")
        @Expose
        private Object _abstract;
        @SerializedName("print_page")
        @Expose
        private String printPage;
        @SerializedName("blog")
        @Expose
        private List<Object> blog = new ArrayList<Object>();
        @SerializedName("source")
        @Expose
        private String source;
        @SerializedName("multimedia")
        @Expose
        private List<Multimedium> multimedia = new ArrayList<Multimedium>();
        @SerializedName("headline")
        @Expose
        private Headline headline;
        @SerializedName("keywords")
        @Expose
        private List<Keyword> keywords = new ArrayList<Keyword>();
        @SerializedName("pub_date")
        @Expose
        private String pubDate;
        @SerializedName("document_type")
        @Expose
        private String documentType;
        @SerializedName("news_desk")
        @Expose
        private String newsDesk;
        @SerializedName("section_name")
        @Expose
        private String sectionName;
        @SerializedName("subsection_name")
        @Expose
        private String subsectionName;
        @SerializedName("byline")
        @Expose
        private Byline byline;
        @SerializedName("type_of_material")
        @Expose
        private String typeOfMaterial;
        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("word_count")
        @Expose
        private String wordCount;
        @SerializedName("slideshow_credits")
        @Expose
        private Object slideshowCredits;

        /**
         *
         * @return
         * The webUrl
         */
        public String getWebUrl() {
            return webUrl;
        }

        /**
         *
         * @param webUrl
         * The web_url
         */
        public void setWebUrl(String webUrl) {
            this.webUrl = webUrl;
        }

        /**
         *
         * @return
         * The snippet
         */
        public String getSnippet() {
            return snippet;
        }

        /**
         *
         * @param snippet
         * The snippet
         */
        public void setSnippet(String snippet) {
            this.snippet = snippet;
        }

        /**
         *
         * @return
         * The leadParagraph
         */
        public String getLeadParagraph() {
            return leadParagraph;
        }

        /**
         *
         * @param leadParagraph
         * The lead_paragraph
         */
        public void setLeadParagraph(String leadParagraph) {
            this.leadParagraph = leadParagraph;
        }

        /**
         *
         * @return
         * The _abstract
         */
        public Object getAbstract() {
            return _abstract;
        }

        /**
         *
         * @param _abstract
         * The abstract
         */
        public void setAbstract(Object _abstract) {
            this._abstract = _abstract;
        }

        /**
         *
         * @return
         * The printPage
         */
        public String getPrintPage() {
            return printPage;
        }

        /**
         *
         * @param printPage
         * The print_page
         */
        public void setPrintPage(String printPage) {
            this.printPage = printPage;
        }

        /**
         *
         * @return
         * The blog
         */
        public List<Object> getBlog() {
            return blog;
        }

        /**
         *
         * @param blog
         * The blog
         */
        public void setBlog(List<Object> blog) {
            this.blog = blog;
        }

        /**
         *
         * @return
         * The source
         */
        public String getSource() {
            return source;
        }

        /**
         *
         * @param source
         * The source
         */
        public void setSource(String source) {
            this.source = source;
        }

        /**
         *
         * @return
         * The multimedia
         */
        public List<Multimedium> getMultimedia() {
            return multimedia;
        }

        /**
         *
         * @param multimedia
         * The multimedia
         */
        public void setMultimedia(List<Multimedium> multimedia) {
            this.multimedia = multimedia;
        }

        /**
         *
         * @return
         * The headline
         */
        public Headline getHeadline() {
            return headline;
        }

        /**
         *
         * @param headline
         * The headline
         */
        public void setHeadline(Headline headline) {
            this.headline = headline;
        }

        /**
         *
         * @return
         * The keywords
         */
        public List<Keyword> getKeywords() {
            return keywords;
        }

        /**
         *
         * @param keywords
         * The keywords
         */
        public void setKeywords(List<Keyword> keywords) {
            this.keywords = keywords;
        }

        /**
         *
         * @return
         * The pubDate
         */
        public String getPubDate() {
            return pubDate;
        }

        /**
         *
         * @param pubDate
         * The pub_date
         */
        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        /**
         *
         * @return
         * The documentType
         */
        public String getDocumentType() {
            return documentType;
        }

        /**
         *
         * @param documentType
         * The document_type
         */
        public void setDocumentType(String documentType) {
            this.documentType = documentType;
        }

        /**
         *
         * @return
         * The newsDesk
         */
        public String getNewsDesk() {
            return newsDesk;
        }

        /**
         *
         * @param newsDesk
         * The news_desk
         */
        public void setNewsDesk(String newsDesk) {
            this.newsDesk = newsDesk;
        }

        /**
         *
         * @return
         * The sectionName
         */
        public String getSectionName() {
            return sectionName;
        }

        /**
         *
         * @param sectionName
         * The section_name
         */
        public void setSectionName(String sectionName) {
            this.sectionName = sectionName;
        }

        /**
         *
         * @return
         * The subsectionName
         */
        public String getSubsectionName() {
            return subsectionName;
        }

        /**
         *
         * @param subsectionName
         * The subsection_name
         */
        public void setSubsectionName(String subsectionName) {
            this.subsectionName = subsectionName;
        }

        /**
         *
         * @return
         * The byline
         */
        public Byline getByline() {
            return byline;
        }

        /**
         *
         * @param byline
         * The byline
         */
        public void setByline(Byline byline) {
            this.byline = byline;
        }

        /**
         *
         * @return
         * The typeOfMaterial
         */
        public String getTypeOfMaterial() {
            return typeOfMaterial;
        }

        /**
         *
         * @param typeOfMaterial
         * The type_of_material
         */
        public void setTypeOfMaterial(String typeOfMaterial) {
            this.typeOfMaterial = typeOfMaterial;
        }

        /**
         *
         * @return
         * The id
         */
        public String getId() {
            return id;
        }

        /**
         *
         * @param id
         * The _id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         *
         * @return
         * The wordCount
         */
        public String getWordCount() {
            return wordCount;
        }

        /**
         *
         * @param wordCount
         * The word_count
         */
        public void setWordCount(String wordCount) {
            this.wordCount = wordCount;
        }

        /**
         *
         * @return
         * The slideshowCredits
         */
        public Object getSlideshowCredits() {
            return slideshowCredits;
        }

        /**
         *
         * @param slideshowCredits
         * The slideshow_credits
         */
        public void setSlideshowCredits(Object slideshowCredits) {
            this.slideshowCredits = slideshowCredits;
        }

    }


    public class Headline {

        @SerializedName("main")
        @Expose
        private String main;
        @SerializedName("print_headline")
        @Expose
        private String printHeadline;

        /**
         *
         * @return
         * The main
         */
        public String getMain() {
            return main;
        }

        /**
         *
         * @param main
         * The main
         */
        public void setMain(String main) {
            this.main = main;
        }

        /**
         *
         * @return
         * The printHeadline
         */
        public String getPrintHeadline() {
            return printHeadline;
        }

        /**
         *
         * @param printHeadline
         * The print_headline
         */
        public void setPrintHeadline(String printHeadline) {
            this.printHeadline = printHeadline;
        }

    }


    public class Keyword {

        @SerializedName("rank")
        @Expose
        private String rank;
        @SerializedName("is_major")
        @Expose
        private String isMajor;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("value")
        @Expose
        private String value;

        /**
         *
         * @return
         * The rank
         */
        public String getRank() {
            return rank;
        }

        /**
         *
         * @param rank
         * The rank
         */
        public void setRank(String rank) {
            this.rank = rank;
        }

        /**
         *
         * @return
         * The isMajor
         */
        public String getIsMajor() {
            return isMajor;
        }

        /**
         *
         * @param isMajor
         * The is_major
         */
        public void setIsMajor(String isMajor) {
            this.isMajor = isMajor;
        }

        /**
         *
         * @return
         * The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         * The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         * The value
         */
        public String getValue() {
            return value;
        }

        /**
         *
         * @param value
         * The value
         */
        public void setValue(String value) {
            this.value = value;
        }

    }


    public class Legacy {

        @SerializedName("thumbnailheight")
        @Expose
        private String thumbnailheight;
        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;
        @SerializedName("thumbnailwidth")
        @Expose
        private String thumbnailwidth;

        /**
         *
         * @return
         * The thumbnailheight
         */
        public String getThumbnailheight() {
            return thumbnailheight;
        }

        /**
         *
         * @param thumbnailheight
         * The thumbnailheight
         */
        public void setThumbnailheight(String thumbnailheight) {
            this.thumbnailheight = thumbnailheight;
        }

        /**
         *
         * @return
         * The thumbnail
         */
        public String getThumbnail() {
            return thumbnail;
        }

        /**
         *
         * @param thumbnail
         * The thumbnail
         */
        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         *
         * @return
         * The thumbnailwidth
         */
        public String getThumbnailwidth() {
            return thumbnailwidth;
        }

        /**
         *
         * @param thumbnailwidth
         * The thumbnailwidth
         */
        public void setThumbnailwidth(String thumbnailwidth) {
            this.thumbnailwidth = thumbnailwidth;
        }

    }


    public class Meta {

        @SerializedName("hits")
        @Expose
        private Integer hits;
        @SerializedName("time")
        @Expose
        private Integer time;
        @SerializedName("offset")
        @Expose
        private Integer offset;

        /**
         *
         * @return
         * The hits
         */
        public Integer getHits() {
            return hits;
        }

        /**
         *
         * @param hits
         * The hits
         */
        public void setHits(Integer hits) {
            this.hits = hits;
        }

        /**
         *
         * @return
         * The time
         */
        public Integer getTime() {
            return time;
        }

        /**
         *
         * @param time
         * The time
         */
        public void setTime(Integer time) {
            this.time = time;
        }

        /**
         *
         * @return
         * The offset
         */
        public Integer getOffset() {
            return offset;
        }

        /**
         *
         * @param offset
         * The offset
         */
        public void setOffset(Integer offset) {
            this.offset = offset;
        }

    }


    public class Multimedium {

        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("subtype")
        @Expose
        private String subtype;
        @SerializedName("legacy")
        @Expose
        private SearchResult.Legacy legacy;
        @SerializedName("type")
        @Expose
        private String type;

        /**
         *
         * @return
         * The width
         */
        public Integer getWidth() {
            return width;
        }

        /**
         *
         * @param width
         * The width
         */
        public void setWidth(Integer width) {
            this.width = width;
        }

        /**
         *
         * @return
         * The url
         */
        public String getUrl() {
            return url;
        }

        /**
         *
         * @param url
         * The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         *
         * @return
         * The height
         */
        public Integer getHeight() {
            return height;
        }

        /**
         *
         * @param height
         * The height
         */
        public void setHeight(Integer height) {
            this.height = height;
        }

        /**
         *
         * @return
         * The subtype
         */
        public String getSubtype() {
            return subtype;
        }

        /**
         *
         * @param subtype
         * The subtype
         */
        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        /**
         *
         * @return
         * The legacy
         */
        public Legacy getLegacy() {
            return legacy;
        }

        /**
         *
         * @param legacy
         * The legacy
         */
        public void setLegacy(Legacy legacy) {
            this.legacy = legacy;
        }

        /**
         *
         * @return
         * The type
         */
        public String getType() {
            return type;
        }

        /**
         *
         * @param type
         * The type
         */
        public void setType(String type) {
            this.type = type;
        }

    }

    public class Person {

        @SerializedName("organization")
        @Expose
        private String organization;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("firstname")
        @Expose
        private String firstname;
        @SerializedName("rank")
        @Expose
        private Integer rank;
        @SerializedName("lastname")
        @Expose
        private String lastname;

        /**
         *
         * @return
         * The organization
         */
        public String getOrganization() {
            return organization;
        }

        /**
         *
         * @param organization
         * The organization
         */
        public void setOrganization(String organization) {
            this.organization = organization;
        }

        /**
         *
         * @return
         * The role
         */
        public String getRole() {
            return role;
        }

        /**
         *
         * @param role
         * The role
         */
        public void setRole(String role) {
            this.role = role;
        }

        /**
         *
         * @return
         * The firstname
         */
        public String getFirstname() {
            return firstname;
        }

        /**
         *
         * @param firstname
         * The firstname
         */
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        /**
         *
         * @return
         * The rank
         */
        public Integer getRank() {
            return rank;
        }

        /**
         *
         * @param rank
         * The rank
         */
        public void setRank(Integer rank) {
            this.rank = rank;
        }

        /**
         *
         * @return
         * The lastname
         */
        public String getLastname() {
            return lastname;
        }

        /**
         *
         * @param lastname
         * The lastname
         */
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

    }

    public class Response {

        @SerializedName("meta")
        @Expose
        private SearchResult.Meta meta;
        @SerializedName("docs")
        @Expose
        private List<SearchResult.Doc> docs = new ArrayList<SearchResult.Doc>();

        /**
         *
         * @return
         * The meta
         */
        public SearchResult.Meta getMeta() {
            return meta;
        }

        /**
         *
         * @param meta
         * The meta
         */
        public void setMeta(SearchResult.Meta meta) {
            this.meta = meta;
        }

        /**
         *
         * @return
         * The docs
         */
        public List<Doc> getDocs() {
            return docs;
        }

        /**
         *
         * @param docs
         * The docs
         */
        public void setDocs(List<Doc> docs) {
            this.docs = docs;
        }

    }

}
