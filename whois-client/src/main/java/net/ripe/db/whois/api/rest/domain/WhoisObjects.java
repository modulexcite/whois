package net.ripe.db.whois.api.rest.domain;

import com.google.common.collect.Lists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@XmlRootElement(name = "objects")
@XmlAccessorType(XmlAccessType.FIELD)
public class WhoisObjects {

    @XmlElement(name = "object", required = true)
    private List<WhoisObject> whoisObjects;

    public WhoisObjects(final List<WhoisObject> whoisObjects) {
        this.whoisObjects = whoisObjects;
    }

    public WhoisObjects() {
        this.whoisObjects = Lists.newArrayList();
    }

    public List<WhoisObject> getWhoisObjects() {
        return whoisObjects == null ? Collections.<WhoisObject>emptyList() : whoisObjects;
    }
}
