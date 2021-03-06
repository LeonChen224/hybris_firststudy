/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2018-3-14 10:57:45
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package concerttours.data;

import concerttours.data.ConcertSummaryData;
import java.util.List;

/**
 * Data object representing a tour
 */
public  class TourData  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>TourData.id</code> property defined at extension <code>concerttours</code>. */
		
	private String id;

	/** <i>Generated property</i> for <code>TourData.tourName</code> property defined at extension <code>concerttours</code>. */
		
	private String tourName;

	/** <i>Generated property</i> for <code>TourData.description</code> property defined at extension <code>concerttours</code>. */
		
	private String description;

	/** <i>Generated property</i> for <code>TourData.concerts</code> property defined at extension <code>concerttours</code>. */
		
	private List<ConcertSummaryData> concerts;
	
	public TourData()
	{
		// default constructor
	}
	
	
	
	public void setId(final String id)
	{
		this.id = id;
	}
	
	
	
	public String getId() 
	{
		return id;
	}
	
	
	
	public void setTourName(final String tourName)
	{
		this.tourName = tourName;
	}
	
	
	
	public String getTourName() 
	{
		return tourName;
	}
	
	
	
	public void setDescription(final String description)
	{
		this.description = description;
	}
	
	
	
	public String getDescription() 
	{
		return description;
	}
	
	
	
	public void setConcerts(final List<ConcertSummaryData> concerts)
	{
		this.concerts = concerts;
	}
	
	
	
	public List<ConcertSummaryData> getConcerts() 
	{
		return concerts;
	}
	


}