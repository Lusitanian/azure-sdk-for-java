/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing facial emotion in form of confidence ranging from 0 to
 * 1.
 */
public class EmotionProperties {
    /**
     * The anger property.
     */
    @JsonProperty(value = "anger")
    private double anger;

    /**
     * The contempt property.
     */
    @JsonProperty(value = "contempt")
    private double contempt;

    /**
     * The disgust property.
     */
    @JsonProperty(value = "disgust")
    private double disgust;

    /**
     * The fear property.
     */
    @JsonProperty(value = "fear")
    private double fear;

    /**
     * The happiness property.
     */
    @JsonProperty(value = "happiness")
    private double happiness;

    /**
     * The neutral property.
     */
    @JsonProperty(value = "neutral")
    private double neutral;

    /**
     * The sadness property.
     */
    @JsonProperty(value = "sadness")
    private double sadness;

    /**
     * The surprise property.
     */
    @JsonProperty(value = "surprise")
    private double surprise;

    /**
     * Get the anger value.
     *
     * @return the anger value
     */
    public double anger() {
        return this.anger;
    }

    /**
     * Set the anger value.
     *
     * @param anger the anger value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withAnger(double anger) {
        this.anger = anger;
        return this;
    }

    /**
     * Get the contempt value.
     *
     * @return the contempt value
     */
    public double contempt() {
        return this.contempt;
    }

    /**
     * Set the contempt value.
     *
     * @param contempt the contempt value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withContempt(double contempt) {
        this.contempt = contempt;
        return this;
    }

    /**
     * Get the disgust value.
     *
     * @return the disgust value
     */
    public double disgust() {
        return this.disgust;
    }

    /**
     * Set the disgust value.
     *
     * @param disgust the disgust value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withDisgust(double disgust) {
        this.disgust = disgust;
        return this;
    }

    /**
     * Get the fear value.
     *
     * @return the fear value
     */
    public double fear() {
        return this.fear;
    }

    /**
     * Set the fear value.
     *
     * @param fear the fear value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withFear(double fear) {
        this.fear = fear;
        return this;
    }

    /**
     * Get the happiness value.
     *
     * @return the happiness value
     */
    public double happiness() {
        return this.happiness;
    }

    /**
     * Set the happiness value.
     *
     * @param happiness the happiness value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withHappiness(double happiness) {
        this.happiness = happiness;
        return this;
    }

    /**
     * Get the neutral value.
     *
     * @return the neutral value
     */
    public double neutral() {
        return this.neutral;
    }

    /**
     * Set the neutral value.
     *
     * @param neutral the neutral value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withNeutral(double neutral) {
        this.neutral = neutral;
        return this;
    }

    /**
     * Get the sadness value.
     *
     * @return the sadness value
     */
    public double sadness() {
        return this.sadness;
    }

    /**
     * Set the sadness value.
     *
     * @param sadness the sadness value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withSadness(double sadness) {
        this.sadness = sadness;
        return this;
    }

    /**
     * Get the surprise value.
     *
     * @return the surprise value
     */
    public double surprise() {
        return this.surprise;
    }

    /**
     * Set the surprise value.
     *
     * @param surprise the surprise value to set
     * @return the EmotionProperties object itself.
     */
    public EmotionProperties withSurprise(double surprise) {
        this.surprise = surprise;
        return this;
    }

}
