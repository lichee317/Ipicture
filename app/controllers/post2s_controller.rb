class Post2sController < ApplicationController
  # GET /post2s
  # GET /post2s.xml
  def index
    @post2s = Post2.find(:all)

    respond_to do |format|
      format.html # index.html.erb
      format.xml  { render :xml => @post2s }
    end
  end

  # GET /post2s/1
  # GET /post2s/1.xml
  def show
    @post2 = Post2.find(params[:id])

    respond_to do |format|
      format.html # show.html.erb
      format.xml  { render :xml => @post2 }
    end
  end

  # GET /post2s/new
  # GET /post2s/new.xml
  def new
    @post2 = Post2.new

    respond_to do |format|
      format.html # new.html.erb
      format.xml  { render :xml => @post2 }
    end
  end

  # GET /post2s/1/edit
  def edit
    @post2 = Post2.find(params[:id])
  end

  # POST /post2s
  # POST /post2s.xml
  def create
    @post2 = Post2.new(params[:post2])

    respond_to do |format|
      if @post2.save
        flash[:notice] = 'Post2 was successfully created.'
        format.html { redirect_to(@post2) }
        format.xml  { render :xml => @post2, :status => :created, :location => @post2 }
      else
        format.html { render :action => "new" }
        format.xml  { render :xml => @post2.errors, :status => :unprocessable_entity }
      end
    end
  end

  # PUT /post2s/1
  # PUT /post2s/1.xml
  def update
    @post2 = Post2.find(params[:id])

    respond_to do |format|
      if @post2.update_attributes(params[:post2])
        flash[:notice] = 'Post2 was successfully updated.'
        format.html { redirect_to(@post2) }
        format.xml  { head :ok }
      else
        format.html { render :action => "edit" }
        format.xml  { render :xml => @post2.errors, :status => :unprocessable_entity }
      end
    end
  end

  # DELETE /post2s/1
  # DELETE /post2s/1.xml
  def destroy
    @post2 = Post2.find(params[:id])
    @post2.destroy

    respond_to do |format|
      format.html { redirect_to(post2s_url) }
      format.xml  { head :ok }
    end
  end
end
