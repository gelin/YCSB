/**
 * Copyright (c) 2013 Thumbtack Technology Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.yahoo.ycsb.measurements.exporter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class NotBufferedTextMeasurementsExporter implements MeasurementsExporter
{

    private PrintStream ps;

    public NotBufferedTextMeasurementsExporter(OutputStream os)
    {
        this.ps = new PrintStream(os);
    }

    public void write(String metric, String measurement, int i) throws IOException
    {
        ps.println("[" + metric + "], " + measurement + ", " + i);
    }

    public void write(String metric, String measurement, double d) throws IOException
    {
        ps.println("[" + metric + "], " + measurement + ", " + d);
    }

    public void close() throws IOException
    {
        this.ps.close();
    }
}
