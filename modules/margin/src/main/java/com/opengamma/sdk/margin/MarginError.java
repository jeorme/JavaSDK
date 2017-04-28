/*
 * Copyright (C) 2016 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.sdk.margin;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.impl.direct.DirectPrivateBeanBuilder;

/**
 * The error details.
 */
@BeanDefinition(builderScope = "private", metaScope = "private", factoryName = "of")
public final class MarginError implements ImmutableBean {

  /**
   * The error reason.
   */
  @PropertyDefinition(validate = "notEmpty")
  private final String reason;
  /**
   * The error message.
   */
  @PropertyDefinition(validate = "notNull")
  private final String message;
  /**
   * The optional error type, such as an exception class name.
   */
  @PropertyDefinition(get = "optional")
  private final String type;

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code MarginError}.
   * @return the meta-bean, not null
   */
  public static MetaBean meta() {
    return MarginError.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(MarginError.Meta.INSTANCE);
  }

  /**
   * Obtains an instance.
   * @param reason  the value of the property, not empty
   * @param message  the value of the property, not null
   * @param type  the value of the property
   * @return the instance
   */
  public static MarginError of(
      String reason,
      String message,
      String type) {
    return new MarginError(
      reason,
      message,
      type);
  }

  private MarginError(
      String reason,
      String message,
      String type) {
    JodaBeanUtils.notEmpty(reason, "reason");
    JodaBeanUtils.notNull(message, "message");
    this.reason = reason;
    this.message = message;
    this.type = type;
  }

  @Override
  public MetaBean metaBean() {
    return MarginError.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the error reason.
   * @return the value of the property, not empty
   */
  public String getReason() {
    return reason;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the error message.
   * @return the value of the property, not null
   */
  public String getMessage() {
    return message;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the optional error type, such as an exception class name.
   * @return the optional value of the property, not null
   */
  public Optional<String> getType() {
    return Optional.ofNullable(type);
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      MarginError other = (MarginError) obj;
      return JodaBeanUtils.equal(reason, other.reason) &&
          JodaBeanUtils.equal(message, other.message) &&
          JodaBeanUtils.equal(type, other.type);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(reason);
    hash = hash * 31 + JodaBeanUtils.hashCode(message);
    hash = hash * 31 + JodaBeanUtils.hashCode(type);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(128);
    buf.append("MarginError{");
    buf.append("reason").append('=').append(reason).append(',').append(' ');
    buf.append("message").append('=').append(message).append(',').append(' ');
    buf.append("type").append('=').append(JodaBeanUtils.toString(type));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code MarginError}.
   */
  private static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code reason} property.
     */
    private final MetaProperty<String> reason = DirectMetaProperty.ofImmutable(
        this, "reason", MarginError.class, String.class);
    /**
     * The meta-property for the {@code message} property.
     */
    private final MetaProperty<String> message = DirectMetaProperty.ofImmutable(
        this, "message", MarginError.class, String.class);
    /**
     * The meta-property for the {@code type} property.
     */
    private final MetaProperty<String> type = DirectMetaProperty.ofImmutable(
        this, "type", MarginError.class, String.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "reason",
        "message",
        "type");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -934964668:  // reason
          return reason;
        case 954925063:  // message
          return message;
        case 3575610:  // type
          return type;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends MarginError> builder() {
      return new MarginError.Builder();
    }

    @Override
    public Class<? extends MarginError> beanType() {
      return MarginError.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -934964668:  // reason
          return ((MarginError) bean).getReason();
        case 954925063:  // message
          return ((MarginError) bean).getMessage();
        case 3575610:  // type
          return ((MarginError) bean).type;
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code MarginError}.
   */
  private static final class Builder extends DirectPrivateBeanBuilder<MarginError> {

    private String reason;
    private String message;
    private String type;

    /**
     * Restricted constructor.
     */
    private Builder() {
      super(meta());
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case -934964668:  // reason
          return reason;
        case 954925063:  // message
          return message;
        case 3575610:  // type
          return type;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case -934964668:  // reason
          this.reason = (String) newValue;
          break;
        case 954925063:  // message
          this.message = (String) newValue;
          break;
        case 3575610:  // type
          this.type = (String) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public MarginError build() {
      return new MarginError(
          reason,
          message,
          type);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(128);
      buf.append("MarginError.Builder{");
      buf.append("reason").append('=').append(JodaBeanUtils.toString(reason)).append(',').append(' ');
      buf.append("message").append('=').append(JodaBeanUtils.toString(message)).append(',').append(' ');
      buf.append("type").append('=').append(JodaBeanUtils.toString(type));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}