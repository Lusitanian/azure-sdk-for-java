/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Edifact agreement protocol settings.
 */
public class EdifactProcessingSettings {
    /**
     * The value indicating whether to mask security information.
     */
    @JsonProperty(value = "maskSecurityInfo", required = true)
    private boolean maskSecurityInfo;

    /**
     * The value indicating whether to preserve interchange.
     */
    @JsonProperty(value = "preserveInterchange", required = true)
    private boolean preserveInterchange;

    /**
     * The value indicating whether to suspend interchange on error.
     */
    @JsonProperty(value = "suspendInterchangeOnError", required = true)
    private boolean suspendInterchangeOnError;

    /**
     * The value indicating whether to create empty xml tags for trailing
     * separators.
     */
    @JsonProperty(value = "createEmptyXmlTagsForTrailingSeparators", required = true)
    private boolean createEmptyXmlTagsForTrailingSeparators;

    /**
     * The value indicating whether to use dot as decimal separator.
     */
    @JsonProperty(value = "useDotAsDecimalSeparator", required = true)
    private boolean useDotAsDecimalSeparator;

    /**
     * Get the maskSecurityInfo value.
     *
     * @return the maskSecurityInfo value
     */
    public boolean maskSecurityInfo() {
        return this.maskSecurityInfo;
    }

    /**
     * Set the maskSecurityInfo value.
     *
     * @param maskSecurityInfo the maskSecurityInfo value to set
     * @return the EdifactProcessingSettings object itself.
     */
    public EdifactProcessingSettings withMaskSecurityInfo(boolean maskSecurityInfo) {
        this.maskSecurityInfo = maskSecurityInfo;
        return this;
    }

    /**
     * Get the preserveInterchange value.
     *
     * @return the preserveInterchange value
     */
    public boolean preserveInterchange() {
        return this.preserveInterchange;
    }

    /**
     * Set the preserveInterchange value.
     *
     * @param preserveInterchange the preserveInterchange value to set
     * @return the EdifactProcessingSettings object itself.
     */
    public EdifactProcessingSettings withPreserveInterchange(boolean preserveInterchange) {
        this.preserveInterchange = preserveInterchange;
        return this;
    }

    /**
     * Get the suspendInterchangeOnError value.
     *
     * @return the suspendInterchangeOnError value
     */
    public boolean suspendInterchangeOnError() {
        return this.suspendInterchangeOnError;
    }

    /**
     * Set the suspendInterchangeOnError value.
     *
     * @param suspendInterchangeOnError the suspendInterchangeOnError value to set
     * @return the EdifactProcessingSettings object itself.
     */
    public EdifactProcessingSettings withSuspendInterchangeOnError(boolean suspendInterchangeOnError) {
        this.suspendInterchangeOnError = suspendInterchangeOnError;
        return this;
    }

    /**
     * Get the createEmptyXmlTagsForTrailingSeparators value.
     *
     * @return the createEmptyXmlTagsForTrailingSeparators value
     */
    public boolean createEmptyXmlTagsForTrailingSeparators() {
        return this.createEmptyXmlTagsForTrailingSeparators;
    }

    /**
     * Set the createEmptyXmlTagsForTrailingSeparators value.
     *
     * @param createEmptyXmlTagsForTrailingSeparators the createEmptyXmlTagsForTrailingSeparators value to set
     * @return the EdifactProcessingSettings object itself.
     */
    public EdifactProcessingSettings withCreateEmptyXmlTagsForTrailingSeparators(boolean createEmptyXmlTagsForTrailingSeparators) {
        this.createEmptyXmlTagsForTrailingSeparators = createEmptyXmlTagsForTrailingSeparators;
        return this;
    }

    /**
     * Get the useDotAsDecimalSeparator value.
     *
     * @return the useDotAsDecimalSeparator value
     */
    public boolean useDotAsDecimalSeparator() {
        return this.useDotAsDecimalSeparator;
    }

    /**
     * Set the useDotAsDecimalSeparator value.
     *
     * @param useDotAsDecimalSeparator the useDotAsDecimalSeparator value to set
     * @return the EdifactProcessingSettings object itself.
     */
    public EdifactProcessingSettings withUseDotAsDecimalSeparator(boolean useDotAsDecimalSeparator) {
        this.useDotAsDecimalSeparator = useDotAsDecimalSeparator;
        return this;
    }

}
