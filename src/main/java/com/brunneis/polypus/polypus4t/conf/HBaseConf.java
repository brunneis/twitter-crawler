/*
    Polypus: a Big Data Self-Deployable Architecture for Microblogging 
    Text Extraction and Real-Time Sentiment Analysis

    Copyright (C) 2017 Rodrigo Martínez (brunneis) <dev@brunneis.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.brunneis.polypus.polypus4t.conf;

import com.brunneis.locker.Locker;

/**
 *
 * @author brunneis
 */
public class HBaseConf extends DBConf {

    public final Locker<String> hbaseZookeeperQuorum = new Locker<>();
    public final Locker<String> hbaseZookeeperPort = new Locker<>();
    public final Locker<String> hbasePrimaryFamily = new Locker<>();
    public final Locker<String> hbaseSecondaryFamily = new Locker<>();

}
