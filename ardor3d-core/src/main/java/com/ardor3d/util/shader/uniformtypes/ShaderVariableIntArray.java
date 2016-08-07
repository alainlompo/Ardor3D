/** * Copyright (c) 2008-2014 Ardor Labs, Inc. * * This file is part of Ardor3D. * * Ardor3D is free software: you can redistribute it and/or modify it  * under the terms of its license which may be found in the accompanying * LICENSE file or at <http://www.ardor3d.com/LICENSE>. */package com.ardor3d.util.shader.uniformtypes;import java.io.IOException;import java.nio.IntBuffer;import com.ardor3d.util.export.InputCapsule;import com.ardor3d.util.export.OutputCapsule;import com.ardor3d.util.shader.ShaderVariable;/** ShaderVariableIntArray */public class ShaderVariableIntArray extends ShaderVariable {    public IntBuffer value;    /**     * Specifies the number of values for each element of the array. Must be 1, 2, 3, or 4.     */    public int size = 1;    @Override    public boolean hasData() {        return value != null;    }    @Override    public void write(final OutputCapsule capsule) throws IOException {        super.write(capsule);        capsule.write(value, "value", null);        capsule.write(size, "size", 1);    }    @Override    public void read(final InputCapsule capsule) throws IOException {        super.read(capsule);        value = capsule.readIntBuffer("value", null);        size = capsule.readInt("size", 1);    }}