/**
 * AlphaMale for web
Copyright (C) 2016 NHN Technology Services

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

 */

package com.nts.alphamaleWeb.msg;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.nts.alphamale.log.ExecutionLog;

import lombok.Data;

@Data
public class ExecutionLogVO {
	@Expose
	private int jobSeq;
	@Expose
	private String jobName;
	@Expose
	private boolean result;
	@Expose
	private List<ExecutionLog> logList;
	
	public ExecutionLogVO(int jobSeq, String jobName, boolean result, List<ExecutionLog> logList){
		this.jobSeq = jobSeq;
		this.jobName = jobName;
		this.result = result;
		this.logList = logList;
	}
}
