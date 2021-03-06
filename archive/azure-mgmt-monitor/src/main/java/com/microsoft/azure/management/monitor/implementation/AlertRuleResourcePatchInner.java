/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import java.util.Map;
import com.microsoft.azure.management.monitor.RuleCondition;
import java.util.List;
import com.microsoft.azure.management.monitor.RuleAction;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The alert rule object for patch operations.
 */
@JsonFlatten
public class AlertRuleResourcePatchInner {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * the name of the alert rule.
     */
    @JsonProperty(value = "properties.name", required = true)
    private String name;

    /**
     * the description of the alert rule that will be included in the alert
     * email.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * the flag that indicates whether the alert rule is enabled.
     */
    @JsonProperty(value = "properties.isEnabled", required = true)
    private boolean isEnabled;

    /**
     * the condition that results in the alert rule being activated.
     */
    @JsonProperty(value = "properties.condition", required = true)
    private RuleCondition condition;

    /**
     * the array of actions that are performed when the alert rule becomes
     * active, and when an alert condition is resolved.
     */
    @JsonProperty(value = "properties.actions")
    private List<RuleAction> actions;

    /**
     * Last time the rule was updated in ISO8601 format.
     */
    @JsonProperty(value = "properties.lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdatedTime;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the AlertRuleResourcePatchInner object itself.
     */
    public AlertRuleResourcePatchInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the AlertRuleResourcePatchInner object itself.
     */
    public AlertRuleResourcePatchInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the AlertRuleResourcePatchInner object itself.
     */
    public AlertRuleResourcePatchInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the isEnabled value.
     *
     * @return the isEnabled value
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled value.
     *
     * @param isEnabled the isEnabled value to set
     * @return the AlertRuleResourcePatchInner object itself.
     */
    public AlertRuleResourcePatchInner withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the condition value.
     *
     * @return the condition value
     */
    public RuleCondition condition() {
        return this.condition;
    }

    /**
     * Set the condition value.
     *
     * @param condition the condition value to set
     * @return the AlertRuleResourcePatchInner object itself.
     */
    public AlertRuleResourcePatchInner withCondition(RuleCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the actions value.
     *
     * @return the actions value
     */
    public List<RuleAction> actions() {
        return this.actions;
    }

    /**
     * Set the actions value.
     *
     * @param actions the actions value to set
     * @return the AlertRuleResourcePatchInner object itself.
     */
    public AlertRuleResourcePatchInner withActions(List<RuleAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the lastUpdatedTime value.
     *
     * @return the lastUpdatedTime value
     */
    public DateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

}
