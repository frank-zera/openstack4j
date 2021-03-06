package org.openstack4j.openstack.sahara.domain;

import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.sahara.NodeGroupTemplate;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * An OpenStack Sahara
 * Unwrap the root name of NodeGroupTemplate when serialized into json request 
 * 
 * @author Ekasit Kijsipongse
 */
public class SaharaNodeGroupTemplateUnwrapped implements ModelEntity {

	private static final long serialVersionUID = 1L;
	
        @JsonUnwrapped
        //@JsonProperty("node_group_template")
	private NodeGroupTemplate template;

        public SaharaNodeGroupTemplateUnwrapped(NodeGroupTemplate template) {
           this.template = template;
        }

        public NodeGroupTemplate getTemplate() { // need for serialization
           return template;
        }
}
